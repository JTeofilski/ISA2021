import decode from 'jwt-decode';

class TokenService {
    getProfile() {
        return decode(window.localStorage.getItem('token'))
    }
}


export default new TokenService();