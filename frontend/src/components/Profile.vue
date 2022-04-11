<template>
<h2>Profil</h2>


</template>

<script>
//import {mapActions, mapGetters} from "vuex";
import TokenService from "@/services/TokenService";

export default {
  name: "Profile Page",
  created() {
    console.log(TokenService.getProfile().sub)
  }
}

</script>

<style>


</style>