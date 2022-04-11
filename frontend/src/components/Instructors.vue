<template>
  <div>
    <h1>Sve avanture</h1>
    <div>
      <table>
        <tbody>
        <tr v-for="tempIns in instructors" v-bind:key = "tempIns.id">
          <td>
            <button @click="instructorDetails(tempIns.id)">{{tempIns.firstName}}</button>
          </td>
        </tr>

        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import DataService from "@/services/DataService";

export default {
  name: "Adventures",
  data(){


    return {
      instructors:[],
    }
  },
  created(){
    DataService.getAllInstructors().then(response => {
      this.instructors = response.data;
      console.log('Stigao odgovor sa beka za instruktore')
      console.log(response.data)
    })
  },
  methods:{
    instructorDetails(tempInstructorId){
      this.$router.push(`/instructorProfile/${tempInstructorId}`)
    }


  },
  computed:{



  }
}
</script>