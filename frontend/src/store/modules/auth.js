import backApi from "@/api/backApi";


const state = {
    token : localStorage.getItem("token"),
    isLoggedIn : localStorage.getItem("token") !== null

};

const getters = {
    getToken: function(state){
        return state.token;
    },
    getIsLoggedIn: function (state){
        return state.isLoggedIn;
    }
};

const mutations = {
    setToken: function (state, newToken){
        state.token = newToken;
        localStorage.setItem("token",newToken)
    },
    setIsLoggedIn: function (state, isLoggedIn){
        state.isLoggedIn = isLoggedIn;
    }
};

const actions = {
    login:async function({commit}, loginParams){
        const params = new URLSearchParams()
        params.append("username", loginParams.username);
        params.append("password", loginParams.password)
        const headers = {}
        headers['Content-type'] = 'application/x-www-form-urlencoded';

        await backApi.post('/login', params, {headers: headers}).then(response => {
            window.location.href = '/home'

            commit('setToken', response.data.token)
            commit('setIsLoggedIn', true)

        }).catch(()=>{
            alert("Pogresan email ilii sifra")

        })


    },
    logOutAction({commit}){
        commit('setToken',null)
        commit('setIsLoggedIn',false)
        window.localStorage.removeItem('token')


    }


};

export default {
    state,
    getters,
    mutations,
    actions
}