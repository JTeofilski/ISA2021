<template>
  <div class="container">
    <h1>Profil stranica vikendice</h1>
      <form>
        <ul>
          <li>
            <h5>Naziv vikendice:</h5>
            <h4>{{house.houseName}}</h4>
          </li>

          <li></li>
            <h5>Adresa vikendice:</h5>
            <h4>{{house.houseAddress}}</h4>
          <li></li>
            <h5>Opis vikendice:</h5>
            <h4>{{house.houseDescription}}</h4>
          <li></li>
          <li>
            <h5>Ocena vikendice:</h5>
            <h4>{{house.houseGrade}}</h4>
          </li>
        </ul>
      </form>
  </div>
</template>


<script>
import DataService from "@/services/DataService";

export default {
  name: "HouseProfilePage",
  data: function () {
    return {
      house: {
        houseName: "",
        houseAddress:null,
        houseDescription: "",
        houseGrade: ""
      }
    }
  },
  created() {
    DataService.getHouseById(this.houseId).then(response => {
      console.log('Stigao odgovor sa beka za vikendice')
      console.log(response.data)
      this.house = response.data;
    })

  },
  computed:{
    houseId(){
      return this.$route.params.tempHouseId

    }

  }


}
</script>

