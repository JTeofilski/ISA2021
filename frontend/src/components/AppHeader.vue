<template>
  <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
      <router-link class="navbar-brand" to="/">ISA APLIKACIJA</router-link>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="mynavbar">
        <ul class="navbar-nav me-auto">
          <li class="nav-item">
            <router-link class="nav-link" to="/home"></router-link>
          </li>

        </ul>
        <form class="d-flex">
          <router-link to="/registration" class="btn btn-primary me-3" type="button">Registruj se</router-link>
          <router-link to="/login" class="btn btn-primary" type="button">Prijavi se</router-link>
        </form>
      </div>
    </div>
  </nav>

</template>

<script>
export default {
  name: "AppHeader"
}
</script>

<style scoped>

</style>