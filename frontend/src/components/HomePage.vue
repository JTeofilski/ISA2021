<template>
  <div class="container">
    <h1 class="d-flex justify-content-center my-5">Početna stranica</h1>

    <div class="row pb-2">
      <router-link to="/houses" class="btn btn-primary w-50" type="button">Vikendice</router-link>
    </div>

    <div class="row pb-2">
      <router-link to="/ships" class="btn btn-primary w-50" type="button">Brodovi</router-link>
    </div>

    <div class="row pb-2">
      <router-link to="/adventures" class="btn btn-primary w-50" type="button">Instruktori i Avanture</router-link>
    </div>







  </div>
</template>

<script>
export default {
  name: "HomePage"
}
</script>

<style scoped>

</style>