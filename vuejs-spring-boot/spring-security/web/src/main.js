import Vue from 'vue'
import App from './App.vue'
import router from "./router";
import store from "./store"
import axios from "axios";

axios.defaults.withCredentials = true;

Vue.config.productionTip = false;

new Vue({
    render: h => h(App),
    router,
    store
}).$mount('#app');
