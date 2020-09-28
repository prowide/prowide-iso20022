
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="CNFL"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="INCO"/&gt;
 *     &lt;enumeration value="DLTD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkflowStatus1Code")
@XmlEnum
public enum WorkflowStatus1Code {


    /**
     * Level details are complete. All required data is populated and verified.
     * 
     */
    COMP,

    /**
     * Level details are incomplete due to conflicting details from 2 or more sources.
     * 
     */
    CNFL,

    /**
     * Level details are complete pending a condition.
     * 
     */
    COND,

    /**
     * Level details are incomplete.
     * 
     */
    INCO,

    /**
     * Level has been deleted, cancelled/deactivated/invalidated by the source or due to error processing error. 
     * 
     */
    DLTD;

    public String value() {
        return name();
    }

    public static WorkflowStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
