
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Payment terminal or ATM performing the transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal4", propOrder = {
    "termnlId",
    "tp",
    "othrTp",
    "cpblties",
    "termnlIntgtn",
    "geogcLctn",
    "outdrInd",
    "offPrmissInd",
    "onBrdInd",
    "poiCmpnt"
})
public class Terminal4 {

    @XmlElement(name = "TermnlId", required = true)
    protected TerminalIdentification3 termnlId;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TerminalType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Cpblties")
    protected Capabilities2 cpblties;
    @XmlElement(name = "TermnlIntgtn")
    @XmlSchemaType(name = "string")
    protected TerminalIntegrationCategory1Code termnlIntgtn;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "OutdrInd")
    protected Boolean outdrInd;
    @XmlElement(name = "OffPrmissInd")
    protected Boolean offPrmissInd;
    @XmlElement(name = "OnBrdInd")
    protected Boolean onBrdInd;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent13> poiCmpnt;

    /**
     * Gets the value of the termnlId property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIdentification3 }
     *     
     */
    public TerminalIdentification3 getTermnlId() {
        return termnlId;
    }

    /**
     * Sets the value of the termnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIdentification3 }
     *     
     */
    public Terminal4 setTermnlId(TerminalIdentification3 value) {
        this.termnlId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalType1Code }
     *     
     */
    public TerminalType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalType1Code }
     *     
     */
    public Terminal4 setTp(TerminalType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal4 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the cpblties property.
     * 
     * @return
     *     possible object is
     *     {@link Capabilities2 }
     *     
     */
    public Capabilities2 getCpblties() {
        return cpblties;
    }

    /**
     * Sets the value of the cpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capabilities2 }
     *     
     */
    public Terminal4 setCpblties(Capabilities2 value) {
        this.cpblties = value;
        return this;
    }

    /**
     * Gets the value of the termnlIntgtn property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public TerminalIntegrationCategory1Code getTermnlIntgtn() {
        return termnlIntgtn;
    }

    /**
     * Sets the value of the termnlIntgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public Terminal4 setTermnlIntgtn(TerminalIntegrationCategory1Code value) {
        this.termnlIntgtn = value;
        return this;
    }

    /**
     * Gets the value of the geogcLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Sets the value of the geogcLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal4 setGeogcLctn(String value) {
        this.geogcLctn = value;
        return this;
    }

    /**
     * Gets the value of the outdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutdrInd() {
        return outdrInd;
    }

    /**
     * Sets the value of the outdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal4 setOutdrInd(Boolean value) {
        this.outdrInd = value;
        return this;
    }

    /**
     * Gets the value of the offPrmissInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffPrmissInd() {
        return offPrmissInd;
    }

    /**
     * Sets the value of the offPrmissInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal4 setOffPrmissInd(Boolean value) {
        this.offPrmissInd = value;
        return this;
    }

    /**
     * Gets the value of the onBrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnBrdInd() {
        return onBrdInd;
    }

    /**
     * Sets the value of the onBrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal4 setOnBrdInd(Boolean value) {
        this.onBrdInd = value;
        return this;
    }

    /**
     * Gets the value of the poiCmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poiCmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent13 }
     * 
     * 
     */
    public List<PointOfInteractionComponent13> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<PointOfInteractionComponent13>();
        }
        return this.poiCmpnt;
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
     * Adds a new item to the pOICmpnt list.
     * @see #getPOICmpnt()
     * 
     */
    public Terminal4 addPOICmpnt(PointOfInteractionComponent13 pOICmpnt) {
        getPOICmpnt().add(pOICmpnt);
        return this;
    }

}
