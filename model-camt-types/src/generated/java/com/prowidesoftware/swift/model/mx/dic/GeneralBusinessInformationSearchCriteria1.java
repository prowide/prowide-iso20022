
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to search for business information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessInformationSearchCriteria1", propOrder = {
    "ref",
    "sbjt",
    "qlfr"
})
public class GeneralBusinessInformationSearchCriteria1 {

    @XmlElement(name = "Ref")
    protected List<String> ref;
    @XmlElement(name = "Sbjt")
    protected List<CharacterSearch1Choice> sbjt;
    @XmlElement(name = "Qlfr")
    protected List<InformationQualifierType1> qlfr;

    /**
     * Gets the value of the ref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRef() {
        if (ref == null) {
            ref = new ArrayList<String>();
        }
        return this.ref;
    }

    /**
     * Gets the value of the sbjt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbjt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbjt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterSearch1Choice }
     * 
     * 
     */
    public List<CharacterSearch1Choice> getSbjt() {
        if (sbjt == null) {
            sbjt = new ArrayList<CharacterSearch1Choice>();
        }
        return this.sbjt;
    }

    /**
     * Gets the value of the qlfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qlfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQlfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationQualifierType1 }
     * 
     * 
     */
    public List<InformationQualifierType1> getQlfr() {
        if (qlfr == null) {
            qlfr = new ArrayList<InformationQualifierType1>();
        }
        return this.qlfr;
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
     * Adds a new item to the ref list.
     * @see #getRef()
     * 
     */
    public GeneralBusinessInformationSearchCriteria1 addRef(String ref) {
        getRef().add(ref);
        return this;
    }

    /**
     * Adds a new item to the sbjt list.
     * @see #getSbjt()
     * 
     */
    public GeneralBusinessInformationSearchCriteria1 addSbjt(CharacterSearch1Choice sbjt) {
        getSbjt().add(sbjt);
        return this;
    }

    /**
     * Adds a new item to the qlfr list.
     * @see #getQlfr()
     * 
     */
    public GeneralBusinessInformationSearchCriteria1 addQlfr(InformationQualifierType1 qlfr) {
        getQlfr().add(qlfr);
        return this;
    }

}
