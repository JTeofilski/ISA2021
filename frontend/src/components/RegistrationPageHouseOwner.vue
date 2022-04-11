<template>
  <div class="container">
    <h1 class="d-flex justify-content-center my-2">Registracija</h1>
    <div class="d-flex justify-content-center">
      <form class="w-50" v-on:submit.prevent="onSubmit">
        <div class="row py-2">
          <div class="col-6">
            <label for="ime" class="form-label">Ime</label>
            <input v-model="user.firstName" type="text" class="form-control" id="ime">
          </div>
          <div class="col-6">
            <label for="prezime" class="form-label">Prezime</label>
            <input v-model="user.lastName" type="text" class="form-control" id="prezime">
          </div>
        </div>

        <div class="row pb-2">
          <div class="col-12">
            <label for="email" class="form-label">Email adresa</label>
            <input v-model="user.email" type="text" class="form-control" id="email">
          </div>
        </div>

        <div class="row pb-2">
          <div class="col-6">
            <label for="lozinka" class="form-label">Lozinka</label>
            <input v-model="user.password" type="password" class="form-control" id="lozinka">
          </div>

          <div class="col-6">
            <label for="lozinkaa" class="form-label">Ponovi lozinku</label>
            <input v-model="user.checkPassword" type="password" class="form-control" id="lozinkaa">
          </div>
        </div>


        <div class="row pb-2">
          <div class="col-6">
            <label for="adresa" class="form-label">Adresa</label>
            <input required v-model="user.address" type="text" class="form-control" id="adresa">
          </div>

          <div class="col-6">
            <label for="telefon" class="form-label">Broj telefona</label>
            <input v-model="user.phoneNumber" type="text" class="form-control" id="telefon">
          </div>
        </div>

        <div class="row pb-2">
          <div class="col-6">
            <label for="drzava" class="form-label">Drzava</label>
            <select v-on:change="onChangeCountry" v-model="user.country" class="form-select" id="drzava">
              <option v-bind:value="null">Izaberite drzavu</option>
              <option v-for="country in allCountries" v-bind:key="country.id" v-bind:value="country">
                {{ country.name }}
              </option>
            </select>
          </div>

          <div class="col-6">
            <label for="grad" class="form-label">Grad</label>
            <select :disabled="!user.country" v-model="user.city" class="form-select" id="grad">
              <option v-bind:value="null">Izaberite grad</option>
              <option v-for="city in allCities" v-bind:key="city.id" v-bind:value="city">
                {{ city.name }}
              </option>
            </select>
          </div>
        </div>

        <input type="radio" id="one" value="Vlasnik vikendice" v-model="user.type">
        <label for="one">Vlasnik vikendice</label>
        <br>
        <input type="radio" id="two" value="Vlasnik broda" v-model="user.type">
        <label for="two">Vlasnik broda</label>
        <br>
        <input type="radio" id="three" value="Instruktor" v-model="user.type">
        <label for="two">Instruktor</label>
        <br>


        <button   type="submit" class="btn btn-primary w-100">Registruj se</button>
      </form>

    </div>

  </div>
</template>





<script>
import DataService from "@/services/DataService";
import {mapActions, mapGetters} from "vuex";

export default {
  name: "RegistrationPageHouseOwner",
  data: function () {
    return {
      user: {
        email: "",
        password: "",
        //checkPassword:"",
        firstName: "",
        lastName: "",
        phoneNumber: "",
        address: "",
        country: null,
        city: null,
        type:null
      }
    }
  },
  computed: mapGetters(['allCountries', 'allCities']),
  methods: {
    ...mapActions(['fetchCountries', 'fetchCities', 'fetchCitiesByCountry']),
    onSubmit() {
      console.log(this.user)
      if(this.user.type === 'Vlasnik vikendice'){
        DataService.postHouseOwner(this.user)
      } else if (this.user.type === 'Vlasnik broda'){
          DataService.postShipOwner(this.user)
      }

    },
    onChangeCountry(){
      this.fetchCitiesByCountry(this.user.country.id);
    }

  },
  created() {
    this.fetchCountries();
    this.fetchCities();
  }
}


</script>

<style scoped>

</style>