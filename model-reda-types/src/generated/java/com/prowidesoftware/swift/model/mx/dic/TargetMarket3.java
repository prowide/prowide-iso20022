
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Target market criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarket3", propOrder = {
    "refDt",
    "invstrTp",
    "knwldgAndOrExprnc",
    "abltyToBearLosses",
    "rskTlrnce",
    "clntObjctvsAndNeeds",
    "othr"
})
public class TargetMarket3 {

    @XmlElement(name = "RefDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "InvstrTp")
    protected InvestorType2 invstrTp;
    @XmlElement(name = "KnwldgAndOrExprnc")
    protected InvestorKnowledge1 knwldgAndOrExprnc;
    @XmlElement(name = "AbltyToBearLosses")
    protected LossBearing2 abltyToBearLosses;
    @XmlElement(name = "RskTlrnce")
    protected RiskTolerance1 rskTlrnce;
    @XmlElement(name = "ClntObjctvsAndNeeds")
    protected InvestorRequirements3 clntObjctvsAndNeeds;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarket1> othr;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TargetMarket3 setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
        return this;
    }

    /**
     * Gets the value of the invstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorType2 }
     *     
     */
    public InvestorType2 getInvstrTp() {
        return invstrTp;
    }

    /**
     * Sets the value of the invstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorType2 }
     *     
     */
    public TargetMarket3 setInvstrTp(InvestorType2 value) {
        this.invstrTp = value;
        return this;
    }

    /**
     * Gets the value of the knwldgAndOrExprnc property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorKnowledge1 }
     *     
     */
    public InvestorKnowledge1 getKnwldgAndOrExprnc() {
        return knwldgAndOrExprnc;
    }

    /**
     * Sets the value of the knwldgAndOrExprnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorKnowledge1 }
     *     
     */
    public TargetMarket3 setKnwldgAndOrExprnc(InvestorKnowledge1 value) {
        this.knwldgAndOrExprnc = value;
        return this;
    }

    /**
     * Gets the value of the abltyToBearLosses property.
     * 
     * @return
     *     possible object is
     *     {@link LossBearing2 }
     *     
     */
    public LossBearing2 getAbltyToBearLosses() {
        return abltyToBearLosses;
    }

    /**
     * Sets the value of the abltyToBearLosses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossBearing2 }
     *     
     */
    public TargetMarket3 setAbltyToBearLosses(LossBearing2 value) {
        this.abltyToBearLosses = value;
        return this;
    }

    /**
     * Gets the value of the rskTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link RiskTolerance1 }
     *     
     */
    public RiskTolerance1 getRskTlrnce() {
        return rskTlrnce;
    }

    /**
     * Sets the value of the rskTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskTolerance1 }
     *     
     */
    public TargetMarket3 setRskTlrnce(RiskTolerance1 value) {
        this.rskTlrnce = value;
        return this;
    }

    /**
     * Gets the value of the clntObjctvsAndNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorRequirements3 }
     *     
     */
    public InvestorRequirements3 getClntObjctvsAndNeeds() {
        return clntObjctvsAndNeeds;
    }

    /**
     * Sets the value of the clntObjctvsAndNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorRequirements3 }
     *     
     */
    public TargetMarket3 setClntObjctvsAndNeeds(InvestorRequirements3 value) {
        this.clntObjctvsAndNeeds = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherTargetMarket1 }
     * 
     * 
     */
    public List<OtherTargetMarket1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<OtherTargetMarket1>();
        }
        return this.othr;
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
     * Adds a new item to the othr list.
     * @see #getOthr()
     * 
     */
    public TargetMarket3 addOthr(OtherTargetMarket1 othr) {
        getOthr().add(othr);
        return this;
    }

}
