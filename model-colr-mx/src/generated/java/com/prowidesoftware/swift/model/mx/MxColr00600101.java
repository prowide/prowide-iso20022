
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.006.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collMgmtCxlSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.006.001.01")
public class MxColr00600101
    extends AbstractMX
{

    @XmlElement(name = "CollMgmtCxlSts", required = true)
    protected CollateralManagementCancellationStatusV01 collMgmtCxlSts;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CollateralCancellationStatus1 .class, CollateralManagementCancellationStatusV01 .class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, ExposureType1Code.class, GenericIdentification29 .class, MxColr00600101 .class, NameAndAddress6 .class, Obligation1 .class, PartyIdentification33Choice.class, PostalAddress2 .class, Reference16 .class, RejectionReasonV021Code.class, RejectionStatus2 .class, Status4Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionAndDocumentIdentification3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.006.001.01";

    public MxColr00600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00600101(final String xml) {
        this();
        MxColr00600101 tmp = parse(xml);
        collMgmtCxlSts = tmp.getCollMgmtCxlSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collMgmtCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralManagementCancellationStatusV01 }
     *     
     */
    public CollateralManagementCancellationStatusV01 getCollMgmtCxlSts() {
        return collMgmtCxlSts;
    }

    /**
     * Sets the value of the collMgmtCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralManagementCancellationStatusV01 }
     *     
     */
    public MxColr00600101 setCollMgmtCxlSts(CollateralManagementCancellationStatusV01 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxColr00600101 parse(String xml) {
        return ((MxColr00600101) MxReadImpl.parse(MxColr00600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00600101 parse(String xml, MxRead parserImpl) {
        return ((MxColr00600101) parserImpl.read(MxColr00600101 .class, xml, _classes));
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
     * Creates an MxColr00600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00600101 message
     * @return
     *     a new instance of MxColr00600101
     */
    public final static MxColr00600101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxColr00600101 .class);
    }

}
