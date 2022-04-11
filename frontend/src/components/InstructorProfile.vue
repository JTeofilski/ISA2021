<template>
  <div class="container">
    <h1>Profil stranica instruktora</h1>
    <form>
      <ul>
        <li>
          <h5>Ime:</h5>
          <h4>{{instructor.firstName}}</h4>
        </li>
        <li></li>
        <h5>Prezime:</h5>
        <h4>{{instructor.lastName}}</h4>
        <li></li>
        <h5>Ime avanture:</h5>
        <h4>{{instructor.adventure.adventureName}}</h4>
        <li></li>
      </ul>
    </form>


    </div>
</template>


<script>
import DataService from "@/services/DataService";

export default {
  name: "InstructorProfilePage",
  data: function () {
    return {
      instructor: {
        firstName: "",
        lastName: "",
        adventure: {
          adventureName: ""
        }
      }
    }
  },
  created() {
    DataService.getInstructorById(this.instructorId).then(response => {
      console.log('Stigao odgovor sa beka za ins')
      console.log(response.data)
      this.instructor = response.data;
    })

  },
  computed: {
    instructorId() {
      return this.$route.params.tempInstructorId

    }
  }
}

</script>

