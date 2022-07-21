# Paseamos Backend 🚀

## Hackathon 2022

**Link to project:** 

FrontEnd: https://github.com/checkmyprojects/hackathon2022

Backend (this one): https://github.com/checkmyprojects/hackathon2022-backend
## How It's Made:

Our backend for the Paseamos frontend.

Made using Spring boot with Java 17.

Uses PostgreSQL on Heroku deploy.

All services are tested.
    
## Team

Hi there!

- Adrián: https://github.com/adrianmoratilla
- Jesús: https://github.com/checkmyprojects
- Jordi: https://github.com/JordiGDavant
- Mario Rubio  https://github.com/marioastur
- Sara: https://github.com/Saracode13
- Taoufik:https://github.com/taoufikL12


## Optimizations

- Code needs some refactoring and clean up.

- Use Swagger for API documentation.

## Lessons Learned:


When deploying to heroku we had to use Postgres because it doesn't support an in-memory database

A good planning helps speed things up.


# API Documentation

### Base Path: /api/pets
## Users
### Return a list of all pets
```GET: /list```
```json
[
    {
        "id": 1,
        "name": "Toby",
        "type": "dog",
        "size": "medium",
        "schedule": "morning",
        "age": 4,
        "owner": "Javier, me gusta hablar de fútbol",
        "ownerAge": 32,
        "description": "Busco gente con quien salir a pasear por las mañanas mientras hablamos del partido de ayer",
        "location": "madrid",
        "img": "https://www.rd.com/wp-content/uploads/2020/11/GettyImages-1248902028.jpg",
        "favourite": true
    },
    {
        "id": 2,
        "name": "Kira",
        "type": "dog",
        "size": "big",
        "schedule": "evening",
        "age": 4,
        "owner": "Raquel, me gusta el código",
        "ownerAge": 32,
        "description": "Quiero hablar de código mientras paseo a mi perra por las noches",
        "location": "barcelona",
        "img": "http://ghk.h-cdn.co/assets/16/08/gettyimages-122137874.jpg",
        "favourite": false
    },
    {
        "id": 3,
        "name": "Kitty",
        "type": "cat",
        "size": "small",
        "schedule": "evening",
        "age": 4,
        "owner": "Raquel, me gusta el código",
        "ownerAge": 32,
        "description": "Quiero hablar de código mientras paseo a mi perra por las noches",
        "location": "barcelona",
        "img": "https://wallup.net/wp-content/uploads/2018/10/07/458379-cat-animal-pet-cats-kitty-cute-sweet.jpg",
        "favourite": false
    },
    {
        "id": 4,
        "name": "Lorito",
        "type": "parrot",
        "size": "big",
        "schedule": "morning",
        "age": 4,
        "owner": "Alberto, amante de los pájaros",
        "ownerAge": 32,
        "description": "Vente a pasear con mi Lorito, se lleva bien con perros pero no gatos",
        "location": "valencia",
        "img": "https://images.fineartamerica.com/images-medium-large/green-parrot-on-green-background-roni-delmonico.jpg",
        "favourite": true
    },
    {
        "id": 5,
        "name": "Piolín",
        "type": "canary",
        "size": "small",
        "schedule": "morning",
        "age": 2,
        "owner": "Abuelita, amante de los pajaritos y los gatitos",
        "ownerAge": 32,
        "description": "Mi Piolín necesita estirar las alas, vamos juntos y nos sentamos a hacer ganchillo mientras juegan",
        "location": "paris",
        "img": "https://i.pinimg.com/736x/6d/28/24/6d28244dd5ec09393dc291d17c565a8d--tweety-bird-tweet-tweet.jpg",
        "favourite": true
    },
    {
        "id": 6,
        "name": "Serpi",
        "type": "snake",
        "size": "small",
        "schedule": "evening",
        "age": 1,
        "owner": "Rosa, me gusta vestir a mi Serpi",
        "ownerAge": 42,
        "description": "Serpi necesita salir de vez en cuando",
        "location": "sevilla",
        "img": "https://i.pinimg.com/originals/14/aa/5c/14aa5c1f3236c1d46b339aa3eb0dd621.jpg",
        "favourite": false
    }
]
```
### Return a pet by {id}
```GET: /id/{id}```
```json
{
    "id": 1,
    "name": "Toby",
    "type": "dog",
    "size": "medium",
    "schedule": "morning",
    "age": 4,
    "owner": "Javier, me gusta hablar de fútbol",
    "ownerAge": 32,
    "description": "Busco gente con quien salir a pasear por las mañanas mientras hablamos del partido de ayer",
    "location": "madrid",
    "img": "https://www.rd.com/wp-content/uploads/2020/11/GettyImages-1248902028.jpg",
    "favourite": true
}
```
### Return all the favourited pets
```GET: /filter/favourites```
```json
[
    {
        "id": 1,
        "name": "Toby",
        "type": "dog",
        "size": "medium",
        "schedule": "morning",
        "age": 4,
        "owner": "Javier, me gusta hablar de fútbol",
        "ownerAge": 32,
        "description": "Busco gente con quien salir a pasear por las mañanas mientras hablamos del partido de ayer",
        "location": "madrid",
        "img": "https://www.rd.com/wp-content/uploads/2020/11/GettyImages-1248902028.jpg",
        "favourite": true
    },
    {
        "id": 4,
        "name": "Lorito",
        "type": "parrot",
        "size": "big",
        "schedule": "morning",
        "age": 4,
        "owner": "Alberto, amante de los pájaros",
        "ownerAge": 32,
        "description": "Vente a pasear con mi Lorito, se lleva bien con perros pero no gatos",
        "location": "valencia",
        "img": "https://images.fineartamerica.com/images-medium-large/green-parrot-on-green-background-roni-delmonico.jpg",
        "favourite": true
    },
    {
        "id": 5,
        "name": "Piolín",
        "type": "canary",
        "size": "small",
        "schedule": "morning",
        "age": 2,
        "owner": "Abuelita, amante de los pajaritos y los gatitos",
        "ownerAge": 32,
        "description": "Mi Piolín necesita estirar las alas, vamos juntos y nos sentamos a hacer ganchillo mientras juegan",
        "location": "paris",
        "img": "https://i.pinimg.com/736x/6d/28/24/6d28244dd5ec09393dc291d17c565a8d--tweety-bird-tweet-tweet.jpg",
        "favourite": true
    }
]
```
### Return all pets on that location
```GET: /location/{location}```

```json
[
    {
        "id": 1,
        "name": "Toby",
        "type": "dog",
        "size": "medium",
        "schedule": "morning",
        "age": 4,
        "owner": "Javier, me gusta hablar de fútbol",
        "ownerAge": 32,
        "description": "Busco gente con quien salir a pasear por las mañanas mientras hablamos del partido de ayer",
        "location": "madrid",
        "img": "https://www.rd.com/wp-content/uploads/2020/11/GettyImages-1248902028.jpg",
        "favourite": true
    }
]
```
### Return all pets of that size
```GET: /size/{size}```

```json
[
    {
        "id": 3,
        "name": "Kitty",
        "type": "cat",
        "size": "small",
        "schedule": "evening",
        "age": 4,
        "owner": "Raquel, me gusta el código",
        "ownerAge": 32,
        "description": "Quiero hablar de código mientras paseo a mi perra por las noches",
        "location": "barcelona",
        "img": "https://wallup.net/wp-content/uploads/2018/10/07/458379-cat-animal-pet-cats-kitty-cute-sweet.jpg",
        "favourite": false
    },
    {
        "id": 5,
        "name": "Piolín",
        "type": "canary",
        "size": "small",
        "schedule": "morning",
        "age": 2,
        "owner": "Abuelita, amante de los pajaritos y los gatitos",
        "ownerAge": 32,
        "description": "Mi Piolín necesita estirar las alas, vamos juntos y nos sentamos a hacer ganchillo mientras juegan",
        "location": "paris",
        "img": "https://i.pinimg.com/736x/6d/28/24/6d28244dd5ec09393dc291d17c565a8d--tweety-bird-tweet-tweet.jpg",
        "favourite": true
    },
    {
        "id": 6,
        "name": "Serpi",
        "type": "snake",
        "size": "small",
        "schedule": "evening",
        "age": 1,
        "owner": "Rosa, me gusta vestir a mi Serpi",
        "ownerAge": 42,
        "description": "Serpi necesita salir de vez en cuando",
        "location": "sevilla",
        "img": "https://i.pinimg.com/originals/14/aa/5c/14aa5c1f3236c1d46b339aa3eb0dd621.jpg",
        "favourite": false
    }
]
```
### Return all pets of that type
```GET: /filter/type/{type}```

```json
[
    {
        "id": 3,
        "name": "Kitty",
        "type": "cat",
        "size": "small",
        "schedule": "evening",
        "age": 4,
        "owner": "Raquel, me gusta el código",
        "ownerAge": 32,
        "description": "Quiero hablar de código mientras paseo a mi perra por las noches",
        "location": "barcelona",
        "img": "https://wallup.net/wp-content/uploads/2018/10/07/458379-cat-animal-pet-cats-kitty-cute-sweet.jpg",
        "favourite": false
    }
]
```

### Returns all pets on that schedule
```GET: /filter/schedule/{schedule}```

```json
[
    {
        "id": 1,
        "name": "Toby",
        "type": "dog",
        "size": "medium",
        "schedule": "morning",
        "age": 4,
        "owner": "Javier, me gusta hablar de fútbol",
        "ownerAge": 32,
        "description": "Busco gente con quien salir a pasear por las mañanas mientras hablamos del partido de ayer",
        "location": "madrid",
        "img": "https://www.rd.com/wp-content/uploads/2020/11/GettyImages-1248902028.jpg",
        "favourite": true
    },
    {
        "id": 4,
        "name": "Lorito",
        "type": "parrot",
        "size": "big",
        "schedule": "morning",
        "age": 4,
        "owner": "Alberto, amante de los pájaros",
        "ownerAge": 32,
        "description": "Vente a pasear con mi Lorito, se lleva bien con perros pero no gatos",
        "location": "valencia",
        "img": "https://images.fineartamerica.com/images-medium-large/green-parrot-on-green-background-roni-delmonico.jpg",
        "favourite": true
    },
    {
        "id": 5,
        "name": "Piolín",
        "type": "canary",
        "size": "small",
        "schedule": "morning",
        "age": 2,
        "owner": "Abuelita, amante de los pajaritos y los gatitos",
        "ownerAge": 32,
        "description": "Mi Piolín necesita estirar las alas, vamos juntos y nos sentamos a hacer ganchillo mientras juegan",
        "location": "paris",
        "img": "https://i.pinimg.com/736x/6d/28/24/6d28244dd5ec09393dc291d17c565a8d--tweety-bird-tweet-tweet.jpg",
        "favourite": true
    }
]
```
