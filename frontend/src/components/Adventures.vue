<template>
  <div>
    <h1>Sve avanture</h1>
    <div>
      <table>
        <tbody>
        <tr v-for="tempAdv in adventures" v-bind:key = "tempAdv.id">
          <td>
            <router-link to="/instructorProfile" class="btn btn-primary w-100" type="button">{{tempAdv.adventureName}}</router-link>
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
      adventures:[],
    }
  },
  created(){
    DataService.getAllAdventures().then(response => {
      this.adventures = response.data;
      console.log('Stigao odgovor sa beka za avanture')
      console.log(response.data)
    })
  },
  methods:{



  },
  computed:{



  }
}
</script>