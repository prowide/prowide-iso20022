
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
 * Class for camt.100.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "drctDbtMndtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1camt.100.001.01")
public class MxCamt10000101
    extends AbstractMX
{

    @XmlElement(name = "DrctDbtMndtRpt", required = true)
    protected DirectDebitMandateReportV01 drctDbtMndtRpt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 100;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, DateAndDateTime2Choice.class, DirectDebitMandateData1 .class, DirectDebitMandateOrBusinessError1Choice.class, DirectDebitMandateReport1 .class, DirectDebitMandateReportOrError1Choice.class, DirectDebitMandateReportV01 .class, ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling4 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification36 .class, MarketInfrastructureIdentification1Choice.class, MaximumAmountAndType1 .class, MaximumAmountType1Choice.class, MessageHeader11 .class, MxCamt10000101 .class, NameAndAddress5 .class, OriginalBusinessQuery1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, RequestType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemAndCurrency1 .class, SystemIdentification2Choice.class, SystemPartyIdentification8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1camt.100.001.01";

    public MxCamt10000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt10000101(final String xml) {
        this();
        MxCamt10000101 tmp = parse(xml);
        drctDbtMndtRpt = tmp.getDrctDbtMndtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt10000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the drctDbtMndtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateReportV01 }
     *     
     */
    public DirectDebitMandateReportV01 getDrctDbtMndtRpt() {
        return drctDbtMndtRpt;
    }

    /**
     * Sets the value of the drctDbtMndtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateReportV01 }
     *     
     */
    public MxCamt10000101 setDrctDbtMndtRpt(DirectDebitMandateReportV01 value) {
        this.drctDbtMndtRpt = value;
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
    public static MxCamt10000101 parse(String xml) {
        return ((MxCamt10000101) MxReadImpl.parse(MxCamt10000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt10000101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt10000101) parserImpl.read(MxCamt10000101 .class, xml, _classes));
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
     * Creates an MxCamt10000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt10000101 message
     * @return
     *     a new instance of MxCamt10000101
     */
    public final static MxCamt10000101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt10000101 .class);
    }

}
