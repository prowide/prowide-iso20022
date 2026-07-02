
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data related to the management plan of a point of interaction (POI).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalManagementDataSet15", propOrder = {
    "id",
    "seqCntr",
    "cntt"
})
public class TerminalManagementDataSet15 {

    @XmlElement(name = "Id", required = true)
    protected DataSetIdentification4 id;
    @XmlElement(name = "SeqCntr")
    protected String seqCntr;
    @XmlElement(name = "Cntt")
    protected ManagementPlanContent4 cntt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification4 }
     *     
     */
    public DataSetIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification4 }
     *     
     */
    public TerminalManagementDataSet15 setId(DataSetIdentification4 value) {
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
    public TerminalManagementDataSet15 setSeqCntr(String value) {
        this.seqCntr = value;
        return this;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlanContent4 }
     *     
     */
    public ManagementPlanContent4 getCntt() {
        return cntt;
    }

    /**
     * Sets the value of the cntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlanContent4 }
     *     
     */
    public TerminalManagementDataSet15 setCntt(ManagementPlanContent4 value) {
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
