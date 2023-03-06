
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.006.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collMgmtCxlSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.006.001.03")
public class MxColr00600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollMgmtCxlSts", required = true)
    protected CollateralManagementCancellationStatusV03 collMgmtCxlSts;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CollateralAccount1 .class, CollateralAccountIdentificationType1Choice.class, CollateralAccountType1Code.class, CollateralCancellationStatus1 .class, CollateralManagementCancellationStatusV03 .class, DateAndDateTimeChoice.class, ExposureType5Code.class, GenericIdentification29 .class, MxColr00600103 .class, NameAndAddress6 .class, Obligation3 .class, PartyIdentification33Choice.class, PostalAddress2 .class, Reference16 .class, RejectionReasonV021Code.class, RejectionStatus2 .class, Status4Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.006.001.03";

    public MxColr00600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00600103(final String xml) {
        this();
        MxColr00600103 tmp = parse(xml);
        collMgmtCxlSts = tmp.getCollMgmtCxlSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collMgmtCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralManagementCancellationStatusV03 }
     *     
     */
    public CollateralManagementCancellationStatusV03 getCollMgmtCxlSts() {
        return collMgmtCxlSts;
    }

    /**
     * Sets the value of the collMgmtCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralManagementCancellationStatusV03 }
     *     
     */
    public MxColr00600103 setCollMgmtCxlSts(CollateralManagementCancellationStatusV03 value) {
        this.collMgmtCxlSts = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxColr00600103 parse(String xml) {
        return ((MxColr00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00600103 parse(String xml, MxRead parserImpl) {
        return ((MxColr00600103) parserImpl.read(MxColr00600103 .class, xml, _classes));
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
     * Creates an MxColr00600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00600103 message
     * @return
     *     a new instance of MxColr00600103
     */
    public final static MxColr00600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00600103 .class);
    }

}
