import { createApp } from 'vue'
import App from './App.vue'
import {createRouter, createWebHistory} from "vue-router";
import store from '@/store'
import HomePage from "@/components/HomePage";
import LoginPage from "@/components/LoginPage";
import RegistrationPage from "@/components/RegistrationPage";
import HouseProfile from "@/components/HouseProfile"
import ShipProfile from "@/components/ShipProfile"
import InstructorProfile from "@/components/InstructorProfile"
import UserProfile from "@/components/UserProfile"

const router = createRouter({
    mode: 'history',
    history: createWebHistory(),
    routes: [
        {path: '/', component:HomePage},
        {path:'/home', component:HomePage},
        {path: '/login',component:LoginPage},
        {path: '/registration',component:RegistrationPage},

        {path: '/houseProfile',component:HouseProfile },
        {path: '/shipProfile',component:ShipProfile },
        {path: '/instructorProfile',component:InstructorProfile },
        {path: '/userProfile',component:UserProfile },

    ]
});


const app = createApp(App);

app.use(router);
app.use(store);
app.mount('#app');