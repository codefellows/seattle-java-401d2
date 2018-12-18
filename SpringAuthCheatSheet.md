# Spring Auth Cheat Sheet

## Step 1: set up a user model and repo

## Step 2: create a controller for that model

## Step 3: UserDetailsServiceImpl implements UserDetailsService

`UserDetails userDetails = new User(appUser.getUsername(), appUser.getPassword(), new ArrayList<>());`

## Step 4: WebSecurityConfig extends WebSecurityConfigurerAdapter

- has a UserDetailsService
- passwordEncoder bean
- configure AuthManagerBuilder
    - `auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());`
- configure HttpSecurity
    - cors? csrf?
    - matchers for URLs that are allowed
    - formLogin with login page set up
    - logout

## Step 5: registration page
- create it w/ form
- ensure it posts to a route your controller is ready for
- check it's saving in the DB
```
    // maybe autologin?
    Authentication authentication = new UsernamePasswordAuthenticationToken(newUser, null, new ArrayList<>());
    SecurityContextHolder.getContext().setAuthentication(authentication);
```

## Step 6: login page
- create it w/ form
- ensure it posts to the route you specified in web config
- try it out!
- add to a template w/ things about the Principal
