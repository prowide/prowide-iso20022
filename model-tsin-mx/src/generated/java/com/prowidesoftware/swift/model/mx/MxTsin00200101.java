
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsin.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invcFincgReqSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01")
public class MxTsin00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvcFincgReqSts", required = true)
    protected InvoiceFinancingRequestStatusV01 invcFincgReqSts;
    public final static transient String BUSINESS_PROCESS = "tsin";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, CancellationStatus4Code.class, CancellationStatusInformation1 .class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, ClearingSystemMemberIdentification2Choice.class, DateAndPlaceOfBirth.class, FinancialInstitutionIdentification6 .class, FinancingAllowedSummary1 .class, FinancingDateDetails1 .class, FinancingInformationAndStatus1 .class, FinancingRateOrAmountChoice.class, FinancingResult1 .class, FinancingStatusReason1Code.class, GenericIdentification3 .class, GenericIdentification4 .class, InstalmentFinancingInformation1 .class, InvoiceFinancingDetails1 .class, InvoiceFinancingRequestStatusV01 .class, MessageIdentification1 .class, MxTsin00200101 .class, OrganisationIdentification2 .class, OriginalInvoiceInformation1 .class, OriginalRequestInformation1 .class, Party2Choice.class, PartyIdentification25 .class, PartyIdentification8 .class, PartyIdentificationAndAccount6 .class, PersonIdentification3 .class, PostalAddress1 .class, RequestStatus1Code.class, SimpleIdentificationInformation2 .class, StatusReason4Choice.class, TechnicalValidationStatus1Code.class, ValidationStatusInformation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01";

    public MxTsin00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsin00200101(final String xml) {
        this();
        MxTsin00200101 tmp = parse(xml);
        invcFincgReqSts = tmp.getInvcFincgReqSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsin00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invcFincgReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFinancingRequestStatusV01 }
     *     
     */
    public InvoiceFinancingRequestStatusV01 getInvcFincgReqSts() {
        return invcFincgReqSts;
    }

    /**
     * Sets the value of the invcFincgReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFinancingRequestStatusV01 }
     *     
     */
    public MxTsin00200101 setInvcFincgReqSts(InvoiceFinancingRequestStatusV01 value) {
        this.invcFincgReqSts = value;
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
    public static MxTsin00200101 parse(String xml) {
        return ((MxTsin00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsin00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsin00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsin00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsin00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsin00200101 parse(String xml, MxRead parserImpl) {
        return ((MxTsin00200101) parserImpl.read(MxTsin00200101 .class, xml, _classes));
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
     * Creates an MxTsin00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsin00200101 message
     * @return
     *     a new instance of MxTsin00200101
     */
    public final static MxTsin00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsin00200101 .class);
    }

}
