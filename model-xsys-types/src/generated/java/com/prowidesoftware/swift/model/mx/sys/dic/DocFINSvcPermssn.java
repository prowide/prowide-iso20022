
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for FINSvcPermssn complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FINSvcPermssn", namespace = "urn:swift:snl:ns.Doc", propOrder = {
    "cat1",
    "cat2",
    "cat3",
    "cat4",
    "cat5",
    "cat6",
    "cat7",
    "cat8",
    "cat9"
})
public class DocFINSvcPermssn {

    @XmlElement(name = "Cat1")
    protected DocPermssn cat1;
    @XmlElement(name = "Cat2")
    protected DocPermssn cat2;
    @XmlElement(name = "Cat3")
    protected DocPermssn cat3;
    @XmlElement(name = "Cat4")
    protected DocPermssn cat4;
    @XmlElement(name = "Cat5")
    protected DocPermssn cat5;
    @XmlElement(name = "Cat6")
    protected DocPermssn cat6;
    @XmlElement(name = "Cat7")
    protected DocPermssn cat7;
    @XmlElement(name = "Cat8")
    protected DocPermssn cat8;
    @XmlElement(name = "Cat9")
    protected DocPermssn cat9;

    /**
     * Gets the value of the cat1 property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getCat1() {
        return cat1;
    }

    /**
     * Sets the value of the cat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public DocFINSvcPermssn setCat1(DocPermssn value) {
        this.cat1 = value;
        return this;
    }

    /**
     * Gets the value of the cat2 property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getCat2() {
        return cat2;
    }

    /**
     * Sets the value of the cat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public DocFINSvcPermssn setCat2(DocPermssn value) {
        this.cat2 = value;
        return this;
    }

    /**
     * Gets the value of the cat3 property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getCat3() {
        return cat3;
    }

    /**
     * Sets the value of the cat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public DocFINSvcPermssn setCat3(DocPermssn value) {
        this.cat3 = value;
        return this;
    }

    /**
     * Gets the value of the cat4 property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getCat4() {
        return cat4;
    }

    /**
     * Sets the value of the cat4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public DocFINSvcPermssn setCat4(DocPermssn value) {
        this.cat4 = value;
        return this;
    }

    /**
     * Gets the value of the cat5 property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getCat5() {
        return cat5;
    }

    /**
     * Sets the value of the cat5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public DocFINSvcPermssn setCat5(DocPermssn value) {
        this.cat5 = value;
        return this;
    }

    /**
     * Gets the value of the cat6 property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getCat6() {
        return cat6;
    }

    /**
     * Sets the value of the cat6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public DocFINSvcPermssn setCat6(DocPermssn value) {
        this.cat6 = value;
        return this;
    }

    /**
     * Gets the value of the cat7 property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getCat7() {
        return cat7;
    }

    /**
     * Sets the value of the cat7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public DocFINSvcPermssn setCat7(DocPermssn value) {
        this.cat7 = value;
        return this;
    }

    /**
     * Gets the value of the cat8 property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getCat8() {
        return cat8;
    }

    /**
     * Sets the value of the cat8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public DocFINSvcPermssn setCat8(DocPermssn value) {
        this.cat8 = value;
        return this;
    }

    /**
     * Gets the value of the cat9 property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getCat9() {
        return cat9;
    }

    /**
     * Sets the value of the cat9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public DocFINSvcPermssn setCat9(DocPermssn value) {
        this.cat9 = value;
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
