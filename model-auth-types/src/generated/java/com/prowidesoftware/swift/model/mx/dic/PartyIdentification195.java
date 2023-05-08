
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Company that is responsible for the management and operation of the fund, that is, determines the investment strategy, appoints the service providers, and makes major decisions for the fund. It is usually responsible for the distribution and marketing of the fund. 
 * For self-managed funds, this will often be a separate promoter or sponsor of the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification195", propOrder = {
    "lei",
    "fndAuthrtyRegnNb",
    "fndMgmtCpnyAuthrtyRegnNb",
    "altrnId",
    "nm"
})
public class PartyIdentification195 {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "FndAuthrtyRegnNb", required = true)
    protected GenericOrganisationIdentification1 fndAuthrtyRegnNb;
    @XmlElement(name = "FndMgmtCpnyAuthrtyRegnNb", required = true)
    protected List<GenericOrganisationIdentification1> fndMgmtCpnyAuthrtyRegnNb;
    @XmlElement(name = "AltrnId", required = true)
    protected GenericIdentification3 altrnId;
    @XmlElement(name = "Nm", required = true)
    protected String nm;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification195 setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the fndAuthrtyRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericOrganisationIdentification1 }
     *     
     */
    public GenericOrganisationIdentification1 getFndAuthrtyRegnNb() {
        return fndAuthrtyRegnNb;
    }

    /**
     * Sets the value of the fndAuthrtyRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericOrganisationIdentification1 }
     *     
     */
    public PartyIdentification195 setFndAuthrtyRegnNb(GenericOrganisationIdentification1 value) {
        this.fndAuthrtyRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the fndMgmtCpnyAuthrtyRegnNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndMgmtCpnyAuthrtyRegnNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndMgmtCpnyAuthrtyRegnNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericOrganisationIdentification1 }
     * 
     * 
     * @return
     *     The value of the fndMgmtCpnyAuthrtyRegnNb property.
     */
    public List<GenericOrganisationIdentification1> getFndMgmtCpnyAuthrtyRegnNb() {
        if (fndMgmtCpnyAuthrtyRegnNb == null) {
            fndMgmtCpnyAuthrtyRegnNb = new ArrayList<>();
        }
        return this.fndMgmtCpnyAuthrtyRegnNb;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification3 }
     *     
     */
    public GenericIdentification3 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification3 }
     *     
     */
    public PartyIdentification195 setAltrnId(GenericIdentification3 value) {
        this.altrnId = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification195 setNm(String value) {
        this.nm = value;
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
     * Adds a new item to the fndMgmtCpnyAuthrtyRegnNb list.
     * @see #getFndMgmtCpnyAuthrtyRegnNb()
     * 
     */
    public PartyIdentification195 addFndMgmtCpnyAuthrtyRegnNb(GenericOrganisationIdentification1 fndMgmtCpnyAuthrtyRegnNb) {
        getFndMgmtCpnyAuthrtyRegnNb().add(fndMgmtCpnyAuthrtyRegnNb);
        return this;
    }

}
