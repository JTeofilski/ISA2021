import { createApp } from 'vue'
import App from './App.vue'
import {createRouter, createWebHistory} from "vue-router";
import store from '@/store'
import HomePage from "@/components/HomePage";
import LoginPage from "@/components/LoginPage";
import RegistrationPage from "@/components/RegistrationPage";

const router = createRouter({
    mode: 'history',
    history: createWebHistory(),
    routes: [
        {path: '/', component:HomePage},
        {path:'/home', component:HomePage},
        {path: '/login',component:LoginPage},
        {path: '/registration',component:RegistrationPage}
    ]
});


const app = createApp(App);

app.use(router);
app.use(store);
app.mount('#app');