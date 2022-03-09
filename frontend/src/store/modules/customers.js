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
        const response = await backApi.post(`/api/customer`, user)
        if (response.status === 200) {
            commit("setCustomer", response.data)
            alert("Korisnik uspesno registrovan")
        } else {
            commit("setCustomer", null)
            alert("Greska sa podacima")

        }
    }
};

export default {
    state,
    getters,
    mutations,
    actions
}