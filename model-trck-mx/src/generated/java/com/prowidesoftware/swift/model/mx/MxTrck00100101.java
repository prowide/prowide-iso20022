
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
 * Class for trck.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pmtStsTrckrUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:trck.001.001.01")
public class MxTrck00100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PmtStsTrckrUpd", required = true)
    protected PaymentStatusTrackerUpdateV01 pmtStsTrckrUpd;
    public final static transient String BUSINESS_PROCESS = "trck";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ChargeBearerType4Code.class, CurrencyExchange16 .class, DateTime1 .class, FinancialInstitutionIdentification20 .class, MxTrck00100101 .class, OrganisationIdentification33 .class, OriginalBusinessInstruction2 .class, PaymentIdentification11 .class, PaymentRejectReturnReason2 .class, PaymentStatusReason2 .class, PaymentStatusTrackerUpdateV01 .class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SettlementInstruction10 .class, SettlementMethod1Code.class, TrackerCharges1 .class, TrackerClearingSystemIdentification1 .class, TrackerData3 .class, TrackerFinancialInstitutionIdentification1 .class, TrackerHeader3 .class, TrackerParty1 .class, TrackerPartyIdentification1 .class, TrackerPaymentRejectReturnReason1Code.class, TrackerPaymentStatus1Code.class, TrackerPaymentTransaction3 .class, TrackerRecord3 .class, TrackerReturnReason1 .class, TrackerStatus3 .class, TrackerStatusAndTransaction3 .class, TrackerStatusReason1 .class, TrackerTransactionStatusReason1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:trck.001.001.01";

    public MxTrck00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrck00100101(final String xml) {
        this();
        MxTrck00100101 tmp = parse(xml);
        pmtStsTrckrUpd = tmp.getPmtStsTrckrUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrck00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pmtStsTrckrUpd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusTrackerUpdateV01 }
     *     
     */
    public PaymentStatusTrackerUpdateV01 getPmtStsTrckrUpd() {
        return pmtStsTrckrUpd;
    }

    /**
     * Sets the value of the pmtStsTrckrUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusTrackerUpdateV01 }
     *     
     */
    public MxTrck00100101 setPmtStsTrckrUpd(PaymentStatusTrackerUpdateV01 value) {
        this.pmtStsTrckrUpd = value;
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
    public static MxTrck00100101 parse(String xml) {
        return ((MxTrck00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrck00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrck00100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrck00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrck00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrck00100101 parse(String xml, MxRead parserImpl) {
        return ((MxTrck00100101) parserImpl.read(MxTrck00100101 .class, xml, _classes));
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
     * Creates an MxTrck00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrck00100101 message
     * @return
     *     a new instance of MxTrck00100101
     */
    public final static MxTrck00100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrck00100101 .class);
    }

}
