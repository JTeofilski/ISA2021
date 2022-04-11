import { createApp } from 'vue'
import App from './App.vue'
import {createRouter, createWebHistory} from "vue-router";
import store from '@/store'
import HomePage from "@/components/HomePage";
import LoginPage from "@/components/LoginPage";
import RegistrationPage from "@/components/RegistrationPage";


import  Houses from "@/components/Houses";
import  Ships from "@/components/Ships";
import  Adventures from "@/components/Instructors";

import HouseProfile from "@/components/HouseProfile";
import ShipProfile from "@/components/ShipProfile";
import InstructorProfile from "@/components/InstructorProfile";
import UserProfile from "@/components/UserProfile";
import RegistrationPageHouseOwner from "@/components/RegistrationPageHouseOwner";
import Profile from "@/components/Profile";

const router = createRouter({
    mode: 'history',
    history: createWebHistory(),
    routes: [
        {path: '/', component:HomePage},
        {path:'/home', component:HomePage},
        {path: '/login',component:LoginPage},
        {path: '/registration',component:RegistrationPage},
        {path: '/registracijaOglasivaca',component:RegistrationPageHouseOwner},
        {path: '/profile',component:Profile},


        {path: '/houses',component:Houses},
        {path: '/ships',component:Ships},
        {path: '/adventures',component:Adventures},

        {path: '/houseProfile/:tempHouseId',component:HouseProfile },
        {path: '/shipProfile/:tempShipId',component:ShipProfile },
        {path: '/instructorProfile/:tempInstructorId',component:InstructorProfile },
        {path: '/userProfile',component:UserProfile },

    ]
});


const app = createApp(App);

app.use(router);
app.use(store);
app.mount('#app');