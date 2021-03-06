package io.syndesis.verifier.impl;

import org.springframework.stereotype.Component;

/**
 * @author kstam
 * @since 8/29/2017
 */
@Component("sql-stored-connector")
public class SqlStoredVerifier extends BaseVerifier {

    protected String getConnectorAction() {
        return "sql-stored-connector";
    }

}
