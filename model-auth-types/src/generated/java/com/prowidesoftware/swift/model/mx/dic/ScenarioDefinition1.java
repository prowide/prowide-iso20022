
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
 * Characteristics used to describe a hypothetical scenario designed to test the value of a portfolio of financial instruments under such hypothetical scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScenarioDefinition1", propOrder = {
    "id",
    "scnroTp",
    "strtgyStrssTp",
    "strssItm",
    "desc"
})
public class ScenarioDefinition1 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification165 id;
    @XmlElement(name = "ScnroTp", required = true)
    @XmlSchemaType(name = "string")
    protected ScenarioType1Code scnroTp;
    @XmlElement(name = "StrtgyStrssTp", required = true)
    @XmlSchemaType(name = "string")
    protected StrategyStressType1Code strtgyStrssTp;
    @XmlElement(name = "StrssItm", required = true)
    protected List<StressItem1> strssItm;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public ScenarioDefinition1 setId(GenericIdentification165 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the scnroTp property.
     * 
     * @return
     *     possible object is
     *     {@link ScenarioType1Code }
     *     
     */
    public ScenarioType1Code getScnroTp() {
        return scnroTp;
    }

    /**
     * Sets the value of the scnroTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScenarioType1Code }
     *     
     */
    public ScenarioDefinition1 setScnroTp(ScenarioType1Code value) {
        this.scnroTp = value;
        return this;
    }

    /**
     * Gets the value of the strtgyStrssTp property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyStressType1Code }
     *     
     */
    public StrategyStressType1Code getStrtgyStrssTp() {
        return strtgyStrssTp;
    }

    /**
     * Sets the value of the strtgyStrssTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyStressType1Code }
     *     
     */
    public ScenarioDefinition1 setStrtgyStrssTp(StrategyStressType1Code value) {
        this.strtgyStrssTp = value;
        return this;
    }

    /**
     * Gets the value of the strssItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strssItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrssItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StressItem1 }
     * 
     * 
     */
    public List<StressItem1> getStrssItm() {
        if (strssItm == null) {
            strssItm = new ArrayList<StressItem1>();
        }
        return this.strssItm;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ScenarioDefinition1 setDesc(String value) {
        this.desc = value;
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
     * Adds a new item to the strssItm list.
     * @see #getStrssItm()
     * 
     */
    public ScenarioDefinition1 addStrssItm(StressItem1 strssItm) {
        getStrssItm().add(strssItm);
        return this;
    }

}
