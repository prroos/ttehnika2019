<template>
    <div id="hello">
        {{msg}}
    </div>
</template>

<script>
    import axios from "axios";

    export default {
        name: 'hello',
        data() {
            return {
                msg: ''
            }
        },
        created: function () {
            axios.get('http://localhost:8080/hello-world').then(response => (this.msg = response.data));
        }
    }
</script>

<style>
    #hello {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        margin-top: 60px;
    }
</style>
