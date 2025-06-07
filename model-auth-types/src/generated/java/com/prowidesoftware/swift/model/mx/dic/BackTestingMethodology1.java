
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the characteristics of a backtesting methodology used to test the performance of a risk model.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackTestingMethodology1", propOrder = {
    "rskMdlTp",
    "mdlCnfdncLvl",
    "vartnMrgnCleanInd",
    "desc"
})
public class BackTestingMethodology1 {

    @XmlElement(name = "RskMdlTp", required = true)
    protected ModelType1Choice rskMdlTp;
    @XmlElement(name = "MdlCnfdncLvl", required = true)
    protected BigDecimal mdlCnfdncLvl;
    @XmlElement(name = "VartnMrgnCleanInd")
    protected boolean vartnMrgnCleanInd;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the rskMdlTp property.
     * 
     * @return
     *     possible object is
     *     {@link ModelType1Choice }
     *     
     */
    public ModelType1Choice getRskMdlTp() {
        return rskMdlTp;
    }

    /**
     * Sets the value of the rskMdlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelType1Choice }
     *     
     */
    public BackTestingMethodology1 setRskMdlTp(ModelType1Choice value) {
        this.rskMdlTp = value;
        return this;
    }

    /**
     * Gets the value of the mdlCnfdncLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMdlCnfdncLvl() {
        return mdlCnfdncLvl;
    }

    /**
     * Sets the value of the mdlCnfdncLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BackTestingMethodology1 setMdlCnfdncLvl(BigDecimal value) {
        this.mdlCnfdncLvl = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnCleanInd property.
     * 
     */
    public boolean isVartnMrgnCleanInd() {
        return vartnMrgnCleanInd;
    }

    /**
     * Sets the value of the vartnMrgnCleanInd property.
     * 
     */
    public BackTestingMethodology1 setVartnMrgnCleanInd(boolean value) {
        this.vartnMrgnCleanInd = value;
        return this;
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
    public BackTestingMethodology1 setDesc(String value) {
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

}
