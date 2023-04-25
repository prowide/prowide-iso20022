
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data set containing the acceptor parameters of a point of interaction (POI).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorConfigurationDataSet1", propOrder = {
    "id",
    "seqCntr",
    "poiId",
    "cfgtnScp",
    "cntt"
})
public class AcceptorConfigurationDataSet1 {

    @XmlElement(name = "Id", required = true)
    protected DataSetIdentification8 id;
    @XmlElement(name = "SeqCntr")
    protected String seqCntr;
    @XmlElement(name = "POIId")
    protected List<GenericIdentification176> poiId;
    @XmlElement(name = "CfgtnScp")
    @XmlSchemaType(name = "string")
    protected PartyType15Code cfgtnScp;
    @XmlElement(name = "Cntt", required = true)
    protected AcceptorConfigurationContent9 cntt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification8 }
     *     
     */
    public DataSetIdentification8 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification8 }
     *     
     */
    public AcceptorConfigurationDataSet1 setId(DataSetIdentification8 value) {
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
    public AcceptorConfigurationDataSet1 setSeqCntr(String value) {
        this.seqCntr = value;
        return this;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOIId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification176 }
     * 
     * 
     * @return
     *     The value of the poiId property.
     */
    public List<GenericIdentification176> getPOIId() {
        if (poiId == null) {
            poiId = new ArrayList<>();
        }
        return this.poiId;
    }

    /**
     * Gets the value of the cfgtnScp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType15Code }
     *     
     */
    public PartyType15Code getCfgtnScp() {
        return cfgtnScp;
    }

    /**
     * Sets the value of the cfgtnScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType15Code }
     *     
     */
    public AcceptorConfigurationDataSet1 setCfgtnScp(PartyType15Code value) {
        this.cfgtnScp = value;
        return this;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationContent9 }
     *     
     */
    public AcceptorConfigurationContent9 getCntt() {
        return cntt;
    }

    /**
     * Sets the value of the cntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationContent9 }
     *     
     */
    public AcceptorConfigurationDataSet1 setCntt(AcceptorConfigurationContent9 value) {
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

    /**
     * Adds a new item to the pOIId list.
     * @see #getPOIId()
     * 
     */
    public AcceptorConfigurationDataSet1 addPOIId(GenericIdentification176 pOIId) {
        getPOIId().add(pOIId);
        return this;
    }

}
