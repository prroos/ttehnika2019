<template>
  <form id="cors-demo" v-on:submit.prevent="onSubmit">
    <!-- text -->
    <p>
      <input type="text" v-model="msg">
    </p>
    <!-- checkbox -->
    <p>
      <input type="checkbox" v-model="checked">
      {{checked ? "yes" : "no"}}
    </p>
    <button class="ui primary button">
      Submit
    </button>
  </form>
</template>

<script>
  import axios from "axios";

export default {
  name: 'CorsForm',
  data() {
      return {
          msg      : '',
          checked  : true,
      }
  },
  methods: {
      onSubmit () {
          axios.post('http://localhost:8080/cors-example', {
              msg: this.msg,
              checked: this.checked
          }).then(response => (this.hello = response.data));
      }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
