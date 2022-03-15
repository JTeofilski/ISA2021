<template>
  <div>
    <h1>Sve vikendice</h1>
    <div>
      <table>
        <tbody>
        <tr v-for="tempShip in ships" v-bind:key = "tempShip.id">
          <td>
            <router-link to="/shipProfile" class="btn btn-primary w-100" type="button">{{tempShip.shipName}}</router-link>
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
  name: "Ships",
  data(){


    return {
      ships:[],
    }
  },
  created(){
    DataService.getAllShips().then(response => {
      this.ships = response.data;
      console.log('Stigao odgovor sa beka za brodove')
      console.log(response.data)
    })
  },
  methods:{



  },
  computed:{



  }
}
</script>