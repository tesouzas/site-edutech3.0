import React, { useState } from 'react';
import { StyleSheet, Text, View, Image, TouchableOpacity } from 'react-native';

import api from './src/services/api';


export default function App() {
  
  async function consulta(){

    const response = await api.get('trilha');
    console.log(response);
  }
  

  return (
    <View style={styles.container}>
      <View>
      <Image  
      style={{
        width: 300,
        height: 300,
        borderRadius: 20,
      }}
      source={{
        uri: 'https://github.com/edutech30.png'
      }}
    />
    </View>

    <View>
    <TouchableOpacity style={styles.button}
            onPress={consulta}
        >
            <Text>Consultar Trilhas</Text>
        </TouchableOpacity>
    </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'blue',
    alignItems: 'center',
    justifyContent: 'center',
  },

  button:{
    backgroundColor: 'white',
    width: 350,
    height:45,
    justifyContent: 'center',
    alignItems: 'center',

}
});
