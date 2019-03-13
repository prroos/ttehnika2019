<template>
  <div id="app">
    <div><router-link to="/hello">Hello World</router-link></div>
    <div><router-link to="/login">Login</router-link></div>
    <div><img alt="Vue logo" src="./assets/logo.png"></div>
    <router-view></router-view>
  </div>
</template>

<script>
  export default {
    name: 'app',
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
