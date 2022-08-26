import {View, Text, StyleSheet, Image, TextInput, Button, TouchableOpacity} from 'react-native';

export default function App(){
  // const nomes = ["Cicrano","Furano","Bertrano","Tobias","Josefino","Juzessara"];
  const user =[
    {
      "img": require('./assets/gato.jpg'),
      "nome": "Cicrano",
      "cargo": "Eletrukitukitado",
    },
    {
      "img": require('./assets/gato.jpg'),
      "nome": "Belzebano",
      "cargo": "Bombeiro",
    },
  {
    "img": require('./assets/gato.jpg'),
    "nome": "Julieto",
    "cargo": "Kongfiu",
  },
  {
    "img": require('./assets/gato.jpg'),
    "nome": "Joãona",
    "cargo": "Mercenária",
  },

  ];
  const imgGato = require('./assets/gato.jpg');
  const trashIcon = require('./assets/siii.png');
      return(
        user.map(user => {
          return (
            <View style={style.container}>
          <View  style={style.primeira}>
          <Text><Image source={user.img} style={{width: '40px', height: '40px', borderRadius: '45%'}} />       {`${user.nome} -    ${user.cargo}`}</Text>
         </View>
         </View> )   
        
          })
      );
      
}
const style = StyleSheet.create({
  container: {
    flex: 1,
     margin:0,
     padding:0,
     alignItems: 'center',
     backgroundColor: '#e2f5c8',
     justifyContent: 'center',


  },

  primeira: { 
    width: '30%',
    border:'1px solid',
    borderColor:'rgba(255,255,255,0.5)',
    borderRadius: '2%',
    backgroundColor: '#F1D2E7',
    paddingLeft: '1%',
    paddingTop: '1%',
    paddingBottom: '1%',
   

  },

  segunda: {

      backgroundColor: '#e2f5c8'
  },

  imgStyle: {
          width: '300px',
          height: '300px',
  },

  input:{
    border:'1px solid black',
    margin:'25px',
    padding:'1px',
  },

    btnExclui:{
      margin: '25px',
      backgroundColor:'#FF0F'
    },
})