
package com.lin.wsdl2;

import ru.inslab.ExecProc;
import ru.inslab.ExecProcJson;
import ru.inslab.ExecProcJsonResponse;
import ru.inslab.ExecProcResponse;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.inslab package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.inslab
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ru.inslab.ExecProcResponse }
     * 
     */
    public ru.inslab.ExecProcResponse createExecProcResponse() {
        return new ru.inslab.ExecProcResponse();
    }

    /**
     * Create an instance of {@link ru.inslab.ExecProcJsonResponse }
     * 
     */
    public ru.inslab.ExecProcJsonResponse createExecProcJsonResponse() {
        return new ExecProcJsonResponse();
    }

    /**
     * Create an instance of {@link ru.inslab.ExecProcJson }
     * 
     */
    public ru.inslab.ExecProcJson createExecProcJson() {
        return new ExecProcJson();
    }

    /**
     * Create an instance of {@link ru.inslab.ExecProc }
     * 
     */
    public ru.inslab.ExecProc createExecProc() {
        return new ExecProc();
    }

    /**
     * Create an instance of {@link ru.inslab.ExecProcResponse.ExecProcResult }
     * 
     */
    public ru.inslab.ExecProcResponse.ExecProcResult createExecProcResponseExecProcResult() {
        return new ExecProcResponse.ExecProcResult();
    }

}
