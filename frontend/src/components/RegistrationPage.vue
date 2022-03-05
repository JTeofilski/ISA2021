<template>
  <div class="container">
    <h1 class="d-flex justify-content-center my-2">Registracija</h1>
      <div class="d-flex justify-content-center">
        <form class="w-50">
          <div class="row py-2">
            <div class="col-6">
              <label for="ime" class="form-label">Ime</label>
              <input type="text" class="form-control" id="ime" >
            </div>
            <div class="col-6">
              <label for="prezime" class="form-label">Prezime</label>
              <input type="text" class="form-control" id="prezime">
            </div>
          </div>

          <div class="row pb-2">
            <div class="col-12">
              <label for="email" class="form-label">Email adresa</label>
              <input type="text" class="form-control" id="email">
            </div>
          </div>

          <div class="row pb-2">
            <div class="col-6">
              <label for="lozinka" class="form-label">Lozinka</label>
              <input type="password" class="form-control" id="lozinka">
            </div>

            <div class="col-6">
              <label for="lozinkaa" class="form-label">Ponovi lozinku</label>
              <input type="password" class="form-control" id="lozinkaa">
            </div>
          </div>


          <div class="row pb-2">
            <div class="col-6">
              <label for="adresa" class="form-label">Adresa</label>
              <input type="text" class="form-control" id="adresa">
            </div>

            <div class="col-6">
              <label for="telefon" class="form-label">Broj telefona</label>
              <input type="text" class="form-control" id="telefon">
            </div>
          </div>

          <div class="row pb-2">
            <div class="col-6">
              <label for="drzava" class="form-label">Drzava</label>
              <input type="text" class="form-control" id="drzava">
            </div>

            <div class="col-6">
              <label for="grad" class="form-label">Grad</label>
              <input type="text" class="form-control" id="grad">
            </div>
          </div>


          <button type="submit" class="btn btn-primary w-100">Registruj se</button>
        </form>

      </div>

  </div>
</template>

<script>
export default {
  name: "RegistrationPage"
}
</script>

<style scoped>

</style>