
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action option securities movement details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOptionSD4", propOrder = {
    "plcAndNm",
    "pyoutNb",
    "pyoutTp",
    "pyoutSts"
})
public class SecuritiesOptionSD4 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "PyoutNb", required = true)
    protected String pyoutNb;
    @XmlElement(name = "PyoutTp", required = true)
    @XmlSchemaType(name = "string")
    protected DTCCPayoutType2Code pyoutTp;
    @XmlElement(name = "PyoutSts", required = true)
    @XmlSchemaType(name = "string")
    protected WorkflowStatus1Code pyoutSts;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOptionSD4 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the pyoutNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPyoutNb() {
        return pyoutNb;
    }

    /**
     * Sets the value of the pyoutNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOptionSD4 setPyoutNb(String value) {
        this.pyoutNb = value;
        return this;
    }

    /**
     * Gets the value of the pyoutTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCPayoutType2Code }
     *     
     */
    public DTCCPayoutType2Code getPyoutTp() {
        return pyoutTp;
    }

    /**
     * Sets the value of the pyoutTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCPayoutType2Code }
     *     
     */
    public SecuritiesOptionSD4 setPyoutTp(DTCCPayoutType2Code value) {
        this.pyoutTp = value;
        return this;
    }

    /**
     * Gets the value of the pyoutSts property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowStatus1Code }
     *     
     */
    public WorkflowStatus1Code getPyoutSts() {
        return pyoutSts;
    }

    /**
     * Sets the value of the pyoutSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowStatus1Code }
     *     
     */
    public SecuritiesOptionSD4 setPyoutSts(WorkflowStatus1Code value) {
        this.pyoutSts = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
