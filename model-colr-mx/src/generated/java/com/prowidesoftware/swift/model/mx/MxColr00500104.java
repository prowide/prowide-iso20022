
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.005.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collMgmtCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.005.001.04")
public class MxColr00500104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollMgmtCxlReq", required = true)
    protected CollateralManagementCancellationRequestV04 collMgmtCxlReq;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CollateralAccount2 .class, CollateralAccountIdentificationType2Choice.class, CollateralAccountType1Code.class, CollateralCancellationReason1 .class, CollateralCancellationType1Choice.class, CollateralManagementCancellationReason1Code.class, CollateralManagementCancellationRequestV04 .class, DateAndDateTimeChoice.class, ExposureType5Code.class, GenericIdentification30 .class, GenericIdentification36 .class, MxColr00500104 .class, NameAndAddress6 .class, Obligation4 .class, PartyIdentification100Choice.class, PostalAddress2 .class, Reference2Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.005.001.04";

    public MxColr00500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00500104(final String xml) {
        this();
        MxColr00500104 tmp = parse(xml);
        collMgmtCxlReq = tmp.getCollMgmtCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collMgmtCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralManagementCancellationRequestV04 }
     *     
     */
    public CollateralManagementCancellationRequestV04 getCollMgmtCxlReq() {
        return collMgmtCxlReq;
    }

    /**
     * Sets the value of the collMgmtCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralManagementCancellationRequestV04 }
     *     
     */
    public MxColr00500104 setCollMgmtCxlReq(CollateralManagementCancellationRequestV04 value) {
        this.collMgmtCxlReq = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxColr00500104 parse(String xml) {
        return ((MxColr00500104) MxReadImpl.parse(MxColr00500104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00500104 parse(String xml, MxRead parserImpl) {
        return ((MxColr00500104) parserImpl.read(MxColr00500104 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxColr00500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00500104 message
     * @return
     *     a new instance of MxColr00500104
     */
    public final static MxColr00500104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00500104 .class);
    }

}
