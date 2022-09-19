
#.graphqlconfig
start configuring graphql by creating a .graphqlconfig file in app directory: app\src\main\graphql
add the graphql configuration, and put graphql server url in Default GraphQL Endpoint:

#schema.graphqls
Every GraphQL service defines a set of types which completely describe the set of possible data you can query on that service. Then, when queries come in, they are validated and executed against that schema.
use Android Studio terminal to import schema.graphqls using this commande:

./gradlew :app:downloadApolloSchema --endpoint='http://api.spacex.land/graphql/' --schema='/Users/aradhakrishnaniye/Aishwarya/GraphQL/app/src/main/graphql/com/example/graphql/schema.graphqls'

or simply, push the play button on GraphQL Plugin (graphqlconfig)

#GraphQL operations
GraphQL has three primary operations:

Query for reading data
Mutation for writing data
Subscription for automatically receiving real-time data over time.

#usersList.graphql
to import users list as an ArrayList, from graphql server, we need to create a graphql query