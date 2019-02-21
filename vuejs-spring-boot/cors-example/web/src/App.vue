<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <cors-form/>
  </div>
</template>

<script>
import CorsForm from './components/Cors.vue'

export default {
  name: 'app',
  components: {
    'cors-form': CorsForm
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
