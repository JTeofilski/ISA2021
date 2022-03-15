<template>
  <div class="container">
    <h1 class="d-flex justify-content-center my-2">Prijava</h1>
      <div class="d-flex justify-content-center">
        <form class="w-50" v-on:submit.prevent="onSubmit">

          <div class="row pb-2">
            <div class="col-12">
              <label for="email" class="form-label">Email adresa</label>
              <input v-model="login.email" type="text" class="form-control" id="email" >
            </div>
          </div>


          <div class="row pb-2">
            <div class="col-12">
              <label for="lozinka" class="form-label">Lozinka</label>
              <input v-model="login.password" type="password" class="form-control" id="lozinka">
            </div>
          </div>

          <button type="submit" class="btn btn-primary w-100">Prijavi se</button>

        </form>
      </div>
  </div>
</template>

<script>

export default {
  name: "LoginPage",
  data : function (){
    return{
      login: {
        email: "",
        password: ""
      }
    }
  },
  methods: {
    onSubmit() {
      console.log(this.login)
      console.log('uspesan login')
    }
  }

}




</script>

<style scoped>

</style>