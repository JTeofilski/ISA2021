<template>
  <div class="container">
    <h1 class="d-flex justify-content-center my-5">Početna stranica</h1>

    <div class="row pb-2">
      <router-link to="/registration" class="btn btn-primary w-50" type="button">Vikendice</router-link>
    </div>

    <div class="row pb-2">
      <router-link to="/registration" class="btn btn-primary w-50" type="button">Brodovi</router-link>
    </div>

    <div class="row pb-2">
      <router-link to="/registration" class="btn btn-primary w-50" type="button">Instruktori</router-link>
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