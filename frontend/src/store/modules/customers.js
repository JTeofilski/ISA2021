import backApi from "@/api/backApi";

const state = {
    newCustomer: null

};

const getters = {};

const mutations = {
    setCustomer: function(state, newCustomer){
        state.newCustomer = newCustomer;
    }


};

const actions = {
    createCustomer: async function ({commit} , user) {
        await backApi.post(`/customer`, user).then(response =>{
            commit("setCustomer", response.data)
            alert("Korisnik uspesno registrovan")
        }).catch(()=>{
            commit("setCustomer", null)
            alert("Greska sa podacima")
        })
    }
};

export default {
    state,
    getters,
    mutations,
    actions
}