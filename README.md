# FLDC-Web-API
Restful web API for folding at home written in Java

## Routes
| Verb | Route                                            |
|------|--------------------------------------------------|
| GET  | /v1/global                                       |
| GET  | /v1/global/{date}                                |
| GET  | /v1/teams                                        |
| GET  | /v1/teams/{date}                                 |
| GET  | /v1/teams/{date}/{teamId}                        |
| GET  | /v1/teams/getName/{teamId}                       |
| GET  | /v1/users                                        |
| GET  | /v1/users/{date}                                 |
| GET  | /v1/users/{date}/{name}                          |
| GET  | /v1/coins                                        |
| GET  | /v1/coins/{date}                                 |
| GET  | /v1/coins/{date}/{coin}                          |
| GET  | /v1/leaderboard/users/{criteria}/{date}/{amount} |
| GET  | /v1/leaderboard/teams/{criteria}/{date}/{amount} |