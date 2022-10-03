import AsyncStorage from '@react-native-async-storage/async-storage';
import { useState } from 'react';
import { StyleSheet, Text, View, TextInput, Button, text } from 'react-native';

export default function App() {

  const [nome, setNome] = useState("");
  const [cargo, setCargo] = useState("");
  const [salario, setSalario] = useState("");
  const [lida,  setLida] = useState("");



  const salvar = async () => {
    try {
      let func =  
      {
          "nome":nome,
          "cargo":cargo,
          "salario":salario  
        }
    
      const jsonf = JSON.stringify(func)
      await AsyncStorage.setItem('data', jsonf)
    } catch (e) {

    }
  }

  // const salvar = async () =>{
  //   try {
  //     await AsyncStorage.setItem("data", info);
  //     setInfo("");
  //   } catch (err) {
  //     console.log(err);
  //   }
  // }

// nome cargo salario
  const ler = async () => {
    try {
      let data = await AsyncStorage.getItem("data");
      setLida(data);
    } catch (err) {
      console.log(err);
    }

  }

  return (
    <View style={styles.container}>
     <TextInput value={info} onChangeText={(val) => {setInfo(val)}}/>
     <Button title='Salver' onPress={() => {salvar()}}/>
     <Button title='Ler' onPress={() => {ler()}}/>
     <Text>{lida}</Text>

     </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});