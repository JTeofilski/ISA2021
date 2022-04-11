<template>
  <div class="container">
    <h1>Profil stranica broda</h1>
    <form>
      <ul>
        <li>
          <h5>Naziv broda:</h5>
          <h4>{{ship.shipName}}</h4>
        </li>

        <li></li>
        <h5>Adresa broda:</h5>
        <h4>{{ship.shipAddress}}</h4>
        <li></li>
        <h5>Opis broda:</h5>
        <h4>{{ship.shipDescription}}</h4>
        <li></li>
        <li>
          <h5>Ocena broda:</h5>
          <h4>{{ship.shipGrade}}</h4>
        </li>
      </ul>
    </form>

    </div>
</template>




<script>
import DataService from "@/services/DataService";

export default {
  name: "ShipProfilePage",
  data: function () {
    return {
      ship: {
        shipName: "",
        shipAddress: null,
        shipDescription: "",
        shipGrade: ""
      }
    }
  },
  created() {
    DataService.getShipById(this.shipId).then(response => {
      console.log('Stigao odgovor sa beka za brod')
      console.log(response.data)
      this.ship = response.data;
    })

  },
  computed:{
    shipId(){
      return this.$route.params.tempShipId

    }

  }

}


</script>
