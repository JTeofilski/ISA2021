<template>
  <div>
    <h1>Sve vikendice</h1>
    <div>
      <table>
        <tbody>
        <tr v-for="tempHouse in houses" v-bind:key = "tempHouse.id">
          <td>
<!--            <router-link to="/houseProfile" class="btn btn-primary w-100" type="button">{{tempHouse.houseName}}</router-link>-->
            <button @click="houseDetails(tempHouse.id)">{{tempHouse.houseName}}</button>
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
  name: "Houses",
  data(){


    return {
      houses:[],
    }
  },
  created(){
    DataService.getAllHouses().then(response => {
      this.houses = response.data;
      console.log('Stigao odgovor sa beka za vikendice')
      console.log(response.data)
    })
  },
  methods:{
    houseDetails(tempHouseId){
      this.$router.push(`/houseProfile/${tempHouseId}`)
    }


  },
  computed:{



  }
}
</script>