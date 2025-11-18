package ma.formations.graphql.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GraphiQLController {

    @GetMapping("/graphiql")
    public String graphiql() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>GraphiQL - Bank Service</title>
                <style>
                    body {
                        margin: 0;
                        font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
                        background: #f6f6f6;
                    }
                    #graphiql {
                        height: 100vh;
                    }
                    .loading {
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        font-size: 18px;
                        color: #666;
                    }
                </style>
                <!-- Utiliser CDN plus stable -->
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/graphiql@3.0.6/graphiql.min.css" />
            </head>
            <body>
                <div id="graphiql">
                    <div class="loading">Loading GraphiQL...</div>
                </div>
                
                <!-- Charger React depuis CDN fiable -->
                <script src="https://cdn.jsdelivr.net/npm/react@18.2.0/umd/react.production.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/react-dom@18.2.0/umd/react-dom.production.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/graphiql@3.0.6/graphiql.min.js"></script>
                
                <script>
                    // Attendre que tout soit chargé
                    function initializeGraphiQL() {
                        console.log('Initializing GraphiQL...');
                        
                        // Vérifier que GraphiQL est disponible
                        if (typeof GraphiQL === 'undefined') {
                            console.error('GraphiQL not loaded yet, retrying...');
                            setTimeout(initializeGraphiQL, 500);
                            return;
                        }
                        
                        try {
                            // Créer le fetcher pour GraphQL
                            const fetcher = GraphiQL.createFetcher({
                                url: '/graphql',
                            });
                            
                            // Rendre le composant GraphiQL
                            ReactDOM.render(
                                React.createElement(GraphiQL, { 
                                    fetcher: fetcher,
                                    defaultQuery: `query {
  customers {
    id
    username
    identityRef
    firstname
    lastname
  }
}`,
                                    headerEditorEnabled: true
                                }),
                                document.getElementById('graphiql')
                            );
                            
                            console.log('GraphiQL initialized successfully!');
                        } catch (error) {
                            console.error('Error initializing GraphiQL:', error);
                            document.getElementById('graphiql').innerHTML = 
                                '<div style="padding: 20px; color: red;">Error loading GraphiQL: ' + error.message + '</div>';
                        }
                    }
                    
                    // Démarrer l'initialisation quand la page est chargée
                    if (document.readyState === 'loading') {
                        document.addEventListener('DOMContentLoaded', initializeGraphiQL);
                    } else {
                        initializeGraphiQL();
                    }
                </script>
            </body>
            </html>
            """;
    }
}