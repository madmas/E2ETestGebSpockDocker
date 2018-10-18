# Angular.js Boilerplate project

A project skeleton to kickstart your angular.js app.

## Getting started

### toolchain

#### Node.js & npm

http://www.nodejs.org

https://www.npmjs.org/

For Ubuntu and OSx:
Use NVM (nodejs version manager) to have an installation that works without sudo rights (this is the case when installing using the repository).
This also offers the flexibility to quickly switch between versions. 
http://www.wenincode.com/installing-node-jsnpm-without-sudo/ (you might adapt the NVM version in the download path)

Also for ruby (in order to install compass) you can use RVM (ruby version manager).


#### Bower

`npm install -g bower`

#### Grunt

http://gruntjs.com/installing-grunt

`npm install -g grunt-cli`
`npm install -g grunt`

### Ruby & Ruby gem


### Compass
gem install compass

### first steps

#### Use this project as a foundation 

Export this project to use it as the boilerplate for your project:

```
mkdir your-new-project-folder
```

get the tar.gz or .tar.bz2 archive from the repository; *do not pick the ZIP* as .zip does not include the .bowerrc and .gitignore files. E.g. paste this in you browser:

and save the file to your new projects folder. Continue with:

```
tar xvzf archive.tar.gz

git init
git add .
git commit -m "Initial commit"
```

Create a repository e.g. on github and push your project there.

#### Start to develop

```
~# npm install

(lot's of output)

~# bower install

(lot's of output)

~# grunt run

(project is being processed and a minimal server is started and the app opened in browser, attached to a live reload)
```

Happy coding :-)
