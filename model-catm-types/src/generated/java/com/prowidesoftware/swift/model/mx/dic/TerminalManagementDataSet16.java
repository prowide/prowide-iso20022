
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data related to the status report of a point of interaction (POI).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalManagementDataSet16", propOrder = {
    "id",
    "seqCntr",
    "cntt"
})
public class TerminalManagementDataSet16 {

    @XmlElement(name = "Id", required = true)
    protected DataSetIdentification6 id;
    @XmlElement(name = "SeqCntr")
    protected String seqCntr;
    @XmlElement(name = "Cntt", required = true)
    protected StatusReportContent5 cntt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification6 }
     *     
     */
    public DataSetIdentification6 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification6 }
     *     
     */
    public TerminalManagementDataSet16 setId(DataSetIdentification6 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the seqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqCntr() {
        return seqCntr;
    }

    /**
     * Sets the value of the seqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TerminalManagementDataSet16 setSeqCntr(String value) {
        this.seqCntr = value;
        return this;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportContent5 }
     *     
     */
    public StatusReportContent5 getCntt() {
        return cntt;
    }

    /**
     * Sets the value of the cntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportContent5 }
     *     
     */
    public TerminalManagementDataSet16 setCntt(StatusReportContent5 value) {
        this.cntt = value;
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
