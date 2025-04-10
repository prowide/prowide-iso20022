
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.005.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collMgmtCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.005.001.02")
public class MxColr00500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollMgmtCxlReq", required = true)
    protected CollateralManagementCancellationRequestV02 collMgmtCxlReq;
    public static final transient String BUSINESS_PROCESS = "colr";
    public static final transient int FUNCTIONALITY = 5;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CollateralCancellationReason1 .class, CollateralCancellationType1Choice.class, CollateralManagementCancellationReason1Code.class, CollateralManagementCancellationRequestV02 .class, DateAndDateTimeChoice.class, ExposureType1Code.class, GenericIdentification29 .class, GenericIdentification30 .class, MxColr00500102 .class, NameAndAddress6 .class, Obligation1 .class, PartyIdentification33Choice.class, PostalAddress2 .class, Reference2Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.005.001.02";

    public MxColr00500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00500102(final String xml) {
        this();
        MxColr00500102 tmp = parse(xml);
        collMgmtCxlReq = tmp.getCollMgmtCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collMgmtCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralManagementCancellationRequestV02 }
     *     
     */
    public CollateralManagementCancellationRequestV02 getCollMgmtCxlReq() {
        return collMgmtCxlReq;
    }

    /**
     * Sets the value of the collMgmtCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralManagementCancellationRequestV02 }
     *     
     */
    public MxColr00500102 setCollMgmtCxlReq(CollateralManagementCancellationRequestV02 value) {
        this.collMgmtCxlReq = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxColr00500102 parse(String xml) {
        return ((MxColr00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00500102 parse(String xml, MxRead parserImpl) {
        return ((MxColr00500102) parserImpl.read(MxColr00500102 .class, xml, _classes));
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
     * Creates an MxColr00500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00500102 message
     * @return
     *     a new instance of MxColr00500102
     */
    public static final MxColr00500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00500102 .class);
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
